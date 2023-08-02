insert into miranum_schema_registry (id_, bundle_, ref_, tag_, json_node_)
values (N'191cee97-33f7-4fd6-8e82-59688b4f47d5', N'test', N'Process_0ht4uve', N'latest',
        N'{"statusConfig":[{"key":"offen","label":"Offen","position":1},{"key":"inBearbeitung","label":"In Bearbeitung","position":2},{"key":"abgeschlossen","label":"Abgeschlossen","position":3}],"configs":[]}'),
       (N'f048d538-5828-4cba-ab49-90b36c28dd8f', N'test', N'deliverform', N'latest',
        N'{ "type": "object", "x-display": "", "allOf": [ { "key": "sectionKey1", "title": "Request", "type": "object", "x-options": { "sectionsTitlesClasses": [ "d-none" ] }, "allOf": [ { "key": "group1", "title": "First Group", "type": "object", "x-options": { "childrenClass": "pl-0" }, "properties": { "details": { "fieldType": "textarea", "type": "string", "x-display": "textarea", "title": "Details", "key": "details", "readOnly": true, "x-props": { "outlined": true, "dense": true }, "x-options": { "fieldColProps": { "messages": {} } }, "x-rules": [] }, "items": { "key": "items", "fieldType": "arrayObject", "title": "Items", "type": "array", "items": { "type": "object", "properties": { "good": { "fieldType": "select", "title": "Item", "type": "string", "key": "good", "anyOf": [ { "title": "phone", "const": "Phone" }, { "title": "contract", "const": "Contract" } ], "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": true }, "x-rules": [] }, "amount": { "fieldType": "integer", "title": "Amount", "type": "integer", "key": "amount", "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": true }, "x-rules": [] } } }, "readOnly": true, "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": false } } } }, { "containerType": "group", "title": "Group", "description": "", "x-options": { "childrenClass": "pl-0" }, "properties": { "answer": { "fieldType": "textarea", "title": "Answer", "x-display": "textarea", "type": "string", "key": "answer", "readOnly": true, "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": true }, "x-rules": [] } }, "key": "d4852768-28a3-40ee-b276-290592a2e21e" } ] } ] }'),
       (N'f048d538-5828-4cba-ab49-90b36c28dd8b', N'test', N'startform', N'latest',
        N'{ "type": "object", "x-display": "", "allOf": [ { "key": "sectionKey1", "title": "Request", "type": "object", "x-options": { "sectionsTitlesClasses": [ "d-none" ] }, "allOf": [ { "key": "group1", "title": "First Group", "type": "object", "x-options": { "childrenClass": "pl-0" }, "properties": { "details": { "fieldType": "textarea", "type": "string", "x-display": "textarea", "title": "Details", "key": "details", "x-props": { "outlined": true, "dense": true }, "x-options": { "fieldColProps": { "messages": {} } }, "x-rules": [] }, "items": { "key": "items", "fieldType": "arrayObject", "title": "Items", "type": "array", "items": { "type": "object", "properties": { "good": { "fieldType": "select", "title": "Item", "type": "string", "key": "good", "anyOf": [ { "title": "phone", "const": "Phone" }, { "title": "contract", "const": "Contract" } ], "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": true }, "x-rules": [] }, "amount": { "fieldType": "integer", "title": "Amount", "type": "integer", "key": "amount", "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": true }, "x-rules": [] } } }, "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": false } } } } ] } ] }'),
       (N'f048d538-5828-4cba-ab49-90b36c28dd8r', N'test', N'decideform', N'latest',
        N'{"type": "object", "x-display": "", "allOf": [ { "key": "sectionKey1", "title": "Request", "type": "object", "x-options": { "sectionsTitlesClasses": [ "d-none" ] }, "allOf": [ { "key": "group1", "title": "First Group", "type": "object", "x-options": { "childrenClass": "pl-0" }, "properties": { "details": { "fieldType": "textarea", "type": "string", "x-display": "textarea", "title": "Details", "key": "details", "readOnly": true, "x-props": { "outlined": true, "dense": true }, "x-options": { "fieldColProps": { "messages": {} } }, "x-rules": [] }, "items": { "key": "items", "fieldType": "arrayObject", "title": "Items", "type": "array", "items": { "type": "object", "properties": { "good": { "fieldType": "select", "title": "Item", "type": "string", "key": "good", "anyOf": [ { "title": "phone", "const": "Phone" }, { "title": "contract", "const": "Contract" } ], "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": true }, "x-rules": [] }, "amount": { "fieldType": "integer", "title": "Amount", "type": "integer", "key": "amount", "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": true }, "x-rules": [] } } }, "readOnly": true, "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": false } } } }, { "containerType": "group", "title": "Group", "description": "", "x-options": { "childrenClass": "pl-0" }, "properties": { "answer": { "fieldType": "textarea", "title": "Answer", "x-display": "textarea", "type": "string", "key": "answer", "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": true }, "x-rules": [] }, "requestOK": { "fieldType": "boolean", "title": "Request OK?", "default": false, "type": "boolean", "key": "requestOK", "x-options": { "fieldColProps": { "cols": 12, "sm": 12, "messages": {} } }, "x-props": { "outlined": true, "dense": true }, "x-rules": [] } }, "key": "d4852768-28a3-40ee-b276-290592a2e21e" } ] } ] }');
