package jsqrcode

class JsqrcodeTagLib {
    //static defaultEncodeAs = 'html'
    //static encodeAsForTags = [tagName: 'raw']
    
    static namespace = 'jsqr'
    
    def scanButton = {attrs ->
        def fieldId = attrs['fieldId']
        out << createScanButton(fieldId)
    }
    
    def createScanButton(fieldId) {
        StringBuilder sb = new StringBuilder()
        sb << """<button onClick="document.getElementById('${fieldId}').value='Hello World!'">Scan</button>"""
        sb.toString()
    }
}
