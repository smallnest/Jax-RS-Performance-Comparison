var restify = require('restify');

function respond(req, res, next) {
  res.send('hello world');
  next();
}

var server = restify.createServer();
server.get('/hello', respond);

server.listen(8080, function() {
  console.log('%s listening at %s', server.name, server.url);
});
