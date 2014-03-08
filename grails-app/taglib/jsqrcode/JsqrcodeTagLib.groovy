package jsqrcode

class JsqrcodeTagLib {
    //static defaultEncodeAs = 'html'
    //static encodeAsForTags = [tagName: 'raw']
    
    static namespace = 'jsqr'
    
    def textField = {attrs ->
        out << createTextField()
    }
    
    def createTextField() {
        StringBuilder sb = new StringBuilder()
        sb << """<input type='text'/><button>Scan</button>"""
        sb.toString()
    }
}
