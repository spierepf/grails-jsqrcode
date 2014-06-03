<!DOCTYPE html>
<html>
    <head>
        <asset:javascript src="jsqrcode.js"/>
    </head>
    <body>
        <div>
            <jsqr:scanCanvas/>
        </div>
        <g:form name="myForm" controller="test" action="myaction">
<!-- 	        <div>
	            <g:textField name="someField"/><jsqr:scanButton fieldId="someField" formId="myForm"/>
	        </div>
	        <div>
	            <g:textField name="someOtherField"/><jsqr:scanButton fieldId="someOtherField"/>
	        </div> -->
	        <div>
	            <g:textField name="someInstantField"/><jsqr:scanOnLoad fieldId="someInstantField"/>
	        </div>
        </g:form>
    </body>
</html>
