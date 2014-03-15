grails-jsqrcode
===============

A Grails plugin for reading qr codes client-side in an HTML5 capable browser.

The included grails-app/views/index.gsp file gives a basic outline of usage.

To include the required javascript code you need to use the following tag:

```
<asset:javascript src="jsqrcode.js"/>
```

You will also need a scanCanvas which acts as a viewfinder for the client's camera. Use the tag:

```
<jsqr:scanCanvas/>
```

Then finally you will need to attach a scanButton to a text field in your view:

```
<jsqr:scanButton fieldId='someFieldId'/>
```

Be sure to assign the fieldId attribute to the id of the field you wish to populate.

When the user clicks on the scanButton the scanCanvas will open and show the view from the camera. When the javascript library correctly scans a qr code, the text of that code will be entered in the text field. 

This code includes a copy of Lazar Laszlo's jsqrcode library which was available from https://github.com/LazarSoft/jsqrcode at the time of this writing. That code, and this is released under the Apache Licence Version 2.0.

Have a nice day.
