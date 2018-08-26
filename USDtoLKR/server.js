var currencyConverter = require ('./routes/currencyConverter');
const bodyParser = require('body-parser');

var express = require('express'),
  app = express();
const port = process.env.PORT || 5000
app.listen(port);
app.use(bodyParser.json());

app.use('/', currencyConverter);
console.log('RESTful API server started on port : ' + port);


