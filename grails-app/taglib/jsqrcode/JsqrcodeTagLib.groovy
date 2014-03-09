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
<video id="jsqr_source" hidden autoplay/>

<script>
var localMediaStream = null;

function captureToCanvas() {
    document.getElementById("jsqr_source").hidden = false;
}

function startScan(fieldId) {
    navigator.getUserMedia  = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia || navigator.msGetUserMedia;
    if (navigator.getUserMedia) {
        navigator.getUserMedia({video: true}, function(stream) {
            document.getElementById("jsqr_source").src = window.URL.createObjectURL(stream);
            captureToCanvas();
            localMediaStream = stream;
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
