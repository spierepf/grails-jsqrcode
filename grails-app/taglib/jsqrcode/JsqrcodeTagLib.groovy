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
<script>
function startScan(fieldId) {
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
