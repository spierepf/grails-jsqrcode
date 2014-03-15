<!DOCTYPE html>
<html>
    <head>
        <asset:javascript src="jsqrcode.js"/>
    </head>
    <body>
        <div>
            <jsqr:scanCanvas/>
        </div>
        <div>
            <g:textField name="someField"/><jsqr:scanButton fieldId="someField"/>
        </div>
        <div>
            <g:textField name="someOtherField"/><jsqr:scanButton fieldId="someOtherField"/>
        </div>
    </body>
</html>
