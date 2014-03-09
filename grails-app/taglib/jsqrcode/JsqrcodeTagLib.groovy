package jsqrcode

class JsqrcodeTagLib {
    //static defaultEncodeAs = 'html'
    //static encodeAsForTags = [tagName: 'raw']
    
    static namespace = 'jsqr'
    
    def scanCanvas = {attrs ->
        out << createScanCanvas()
    }
    
    def scanButton = {attrs ->
        def fieldId = attrs['fieldId']
        out << createScanButton(fieldId)
    }
    
    def createScanCanvas() {
        StringBuilder sb = new StringBuilder()
        sb << """
<video id="jsqr_source" hidden autoplay></video>
<canvas id="qr-canvas" width="640" height="480" hidden></canvas>
<img id="jsqr_display" src="" width="320" height="240" hidden>

<script>
var localMediaStream = null;
var video = document.getElementById("jsqr_source");
var canvas = document.getElementById("qr-canvas");
var display = document.getElementById("jsqr_display");
var canvasContext = canvas.getContext('2d');

function showDisplay() {
    display.hidden = false;
}

function hideDisplay() {
    display.hidden = true;
}

function captureToCanvas() {
    if(localMediaStream) {
        canvasContext.drawImage(video, 0, 0);
        display.src = canvas.toDataURL('image/webp');
        setTimeout(captureToCanvas, 500);
    }
}

function startScan(fieldId) {
    navigator.getUserMedia  = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia || navigator.msGetUserMedia;
    if (navigator.getUserMedia) {
        navigator.getUserMedia({video: true}, function(stream) {
            document.getElementById("jsqr_source").src = window.URL.createObjectURL(stream);
            localMediaStream = stream;
            showDisplay();
            captureToCanvas();
        }, function(e) {console.log('Reeeejected!', e);});
    }

    document.getElementById(fieldId).value='Hello World!';
}
</script>
"""
        sb.toString()
    }
    
    def createScanButton(fieldId) {
        StringBuilder sb = new StringBuilder()
        sb << """<button onClick="startScan('${fieldId}')">Scan</button>"""
        sb.toString()
    }
}
