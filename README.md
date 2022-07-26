# decode-base64

## Description
The purpose of this ms is decode base64 strings

## APIs description
```java
   decode(DecodeBase64Request request)
```
This API is used to decode base64 chains in plain text.

   1.  Receives the base64 chain
   2.  Decode the base64 chain with the decode type
   3.  Return the decoded text string with 200 http code
   
### Versioning

- 0.0.1-SNAPSHOT

#### Important Changes

- **Changes**
- initial-commit
- added README.md



### Endpoints

>/api/decode

### Request & Response examples

- URL : /api/decode
- Method : POST

```json
Test data :

> Request sample:
{
    "decodeType" : "base64",
    "encodedText" : "dGV4dFBsYWlu"
}


> Response sample: 
{
    "textPlain": "textPlain"
}

```
