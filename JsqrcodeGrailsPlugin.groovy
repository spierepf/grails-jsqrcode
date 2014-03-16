class JsqrcodeGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.0 > *"
    def pluginExcludes = [
        "grails-app/views/index.gsp"
    ]
    def title = "Jsqrcode Plugin"
    def description = 'Reads qr codes client-side in an HTML5 capable browser'
    def documentation = "http://grails.org/plugin/jsqrcode"
    def license = "APACHE"
    def developers = [
        [name: ' Peter-Frank Spierenburg spierepf', email: 'spierepf@hotmail.com']
    ]
    def issueManagement = [system: 'GITHUB', url: 'https://github.com/spierepf/grails-jsqrcode/issues']
    def scm = [url: 'https://github.com/spierepf/grails-jsqrcode']
}

