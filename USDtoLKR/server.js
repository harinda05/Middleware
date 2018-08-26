var currencyConverter = require ('./routes/currencyConverter');
const bodyParser = require('body-parser');

var express = require('express'),
  app = express();
const port = process.env.PORT || 5000
app.listen(port);
app.use(bodyParser.json());

app.use('/', currencyConverter);
console.log('RESTful API server started on port : ' + port);

// var data = [{
//   "Service_Name" : "UsdtoLkrService",
//   "Service_Call_Name" :  "usdtolkr",
//   "Configs" : {
//     "location"  : "https://usdtolkrservice.herokuapp.com/",
//     "port" : port,
//     "type" : "REST",
//     "method" : "POST",
//     "parameters" : {
//       "parameter_01" : "number",
//     }
//   }
// }
//   ];
 
// fetch('http://localhost:3000/test', {
//     method: 'POST',
//     body: JSON.stringify(data),
//     headers: {'Content-Type': 'application/json'}
// }).then(data => { 
//   alert(JSON.stringify(data));
// }).catch(err => {
//     alert(err);
// });
