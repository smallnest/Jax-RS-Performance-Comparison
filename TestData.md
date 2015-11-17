### jersey-grizzly2
```
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.98ms    2.06ms  48.92ms   92.37%
    Req/Sec     3.71k   274.18     9.93k    82.39%
  1774190 requests in 30.10s, 191.32MB read
Requests/sec:  58944.39
Transfer/sec:      6.36MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.32ms    1.89ms  41.80ms   91.65%
    Req/Sec     3.86k   237.06    10.04k    86.86%
  1844871 requests in 30.10s, 198.94MB read
Requests/sec:  61292.59
Transfer/sec:      6.61MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     8.14ms    2.35ms 211.50ms   88.87%
    Req/Sec     3.84k   365.89    12.98k    96.16%
  1835462 requests in 30.10s, 197.92MB read
Requests/sec:  60971.94
Transfer/sec:      6.57MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.04ms    3.88ms 224.75ms   88.42%
    Req/Sec     3.88k   517.01    22.61k    96.20%
  1846019 requests in 30.09s, 199.06MB read
Requests/sec:  61357.23
Transfer/sec:      6.62MB
```

### jersey-jetty
```
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/hello
Running 30s test @ http://127.0.0.1:8080/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.09ms    8.88ms 163.37ms   93.57%
    Req/Sec     3.51k   675.65     8.22k    72.92%
  1677456 requests in 30.10s, 259.16MB read
Requests/sec:  55721.64
Transfer/sec:      8.61MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/hello 
Running 30s test @ http://127.0.0.1:8080/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.66ms   11.76ms 216.25ms   94.88%
    Req/Sec     3.72k   769.93    12.15k    78.25%
  1777091 requests in 30.10s, 274.55MB read
Requests/sec:  59040.40
Transfer/sec:      9.12MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/hello 
Running 30s test @ http://127.0.0.1:8080/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     8.70ms    4.85ms 221.85ms   74.93%
    Req/Sec     3.61k   436.24    10.79k    83.47%
  1727962 requests in 30.09s, 266.96MB read
Requests/sec:  57420.08
Transfer/sec:      8.87MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/hello 
Running 30s test @ http://127.0.0.1:8080/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.38ms    7.79ms 115.97ms   77.13%
    Req/Sec     3.80k   387.32    10.29k    75.07%
  1817317 requests in 30.08s, 280.77MB read
Requests/sec:  60419.20
Transfer/sec:      9.33MB
```

### resteasy-netty https://github.com/resteasy/Resteasy/tree/master/jaxrs/server-adapters/resteasy-netty4
```
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/rest/hello
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.55ms    1.79ms  39.29ms   88.35%
    Req/Sec     5.17k   473.68    16.08k    82.22%
  2470498 requests in 30.10s, 235.61MB read
Requests/sec:  82078.17
Transfer/sec:      7.83MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.72ms    2.68ms 212.44ms   86.44%
    Req/Sec     5.16k   536.58    10.62k    89.71%
  2460323 requests in 30.10s, 234.63MB read
Requests/sec:  81742.81
Transfer/sec:      7.80MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.14ms    4.29ms 218.98ms   65.61%
    Req/Sec     5.32k   399.82    13.75k    85.94%
  2546559 requests in 30.10s, 242.86MB read
Requests/sec:  84604.20
Transfer/sec:      8.07MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    11.73ms    6.59ms 240.40ms   72.53%
    Req/Sec     5.29k   735.57    24.29k    95.86%
  2530059 requests in 30.09s, 241.29MB read
Requests/sec:  84077.04
Transfer/sec:      8.02MB
```


### resteasy-undertow https://github.com/resteasy/Resteasy/tree/master/jaxrs/server-adapters/resteasy-undertow
```
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/rest/hello
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.35ms    1.26ms  29.65ms   89.78%
    Req/Sec     5.11k   482.19    13.41k    70.58%
  2445424 requests in 30.10s, 319.50MB read
Requests/sec:  81245.94
Transfer/sec:     10.62MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.34ms    1.24ms  20.15ms   82.58%
    Req/Sec     5.27k   402.57    10.10k    70.97%
  2524874 requests in 30.10s, 329.88MB read
Requests/sec:  83896.30
Transfer/sec:     10.96MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.53ms    1.37ms 211.98ms   82.84%
    Req/Sec     5.58k   468.63    12.95k    89.39%
  2672701 requests in 30.10s, 349.20MB read
Requests/sec:  88808.18
Transfer/sec:     11.60MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    10.71ms    4.21ms 222.46ms   94.80%
    Req/Sec     5.63k     1.07k   20.80k    91.21%
  2697266 requests in 30.09s, 352.41MB read
Requests/sec:  89646.47
Transfer/sec:     11.71MB
```

### Dropwizard 
```
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/rest/hello
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    10.56ms   20.00ms 331.02ms   87.74%
    Req/Sec     3.69k     1.02k   12.27k    70.18%
  1764292 requests in 30.10s, 190.13MB read
Requests/sec:  58617.07
Transfer/sec:      6.32MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    12.31ms   24.45ms 373.46ms   89.65%
    Req/Sec     3.73k     1.07k   11.42k    69.94%
  1778938 requests in 30.10s, 191.71MB read
Requests/sec:  59104.61
Transfer/sec:      6.37MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    13.47ms   21.35ms 398.83ms   91.93%
    Req/Sec     3.79k     1.00k   14.20k    68.85%
  1815458 requests in 30.09s, 195.64MB read
Requests/sec:  60338.83
Transfer/sec:      6.50MB


[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    33.55ms   88.33ms   1.20s    95.32%
    Req/Sec     3.75k     1.06k   13.18k    69.77%
  1791296 requests in 30.09s, 193.04MB read
Requests/sec:  59534.43
Transfer/sec:      6.42MB
```






