package jsqrcode

class JsqrcodeTagLib {
    //static defaultEncodeAs = 'html'
    //static encodeAsForTags = [tagName: 'raw']
    
    static namespace = 'jsqr'
    
    def scanButton = {attrs ->
        def fieldName = attrs['fieldName']
        out << createScanButton(fieldName)
    }
    
    def createScanButton(fieldName) {
        StringBuilder sb = new StringBuilder()
        sb << """<button onClick = "alert('${fieldName}')">Scan</button>"""
        sb.toString()
    }
}
