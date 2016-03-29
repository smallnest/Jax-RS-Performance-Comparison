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


### spring boot 1.3.0.RELEASE
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/hello
Running 30s test @ http://127.0.0.1:8080/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.39ms    4.10ms  58.23ms   90.89%
    Req/Sec     2.31k   301.34     6.31k    70.86%
  1107622 requests in 30.10s, 162.87MB read
Requests/sec:  36799.74
Transfer/sec:      5.41MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/hello 
Running 30s test @ http://127.0.0.1:8080/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.34ms    8.62ms 125.04ms   95.44%
    Req/Sec     2.38k   263.37     6.62k    75.76%
  1138849 requests in 30.09s, 167.46MB read
Requests/sec:  37847.67
Transfer/sec:      5.57MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/hello 
Running 30s test @ http://127.0.0.1:8080/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    12.99ms    5.43ms 123.32ms   82.28%
    Req/Sec     2.43k   183.80     5.77k    76.53%
  1161165 requests in 30.09s, 170.74MB read
Requests/sec:  38592.82
Transfer/sec:      5.67MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/hello 
Running 30s test @ http://127.0.0.1:8080/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    25.73ms    4.36ms  72.17ms   78.96%
    Req/Sec     2.42k   177.95     6.94k    80.52%
  1156937 requests in 30.10s, 170.11MB read
Requests/sec:  38436.42
Transfer/sec:      5.65MB

### native netty
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/rest/hello
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.45ms    2.65ms  46.81ms   90.93%
    Req/Sec     8.30k   787.93    12.00k    72.23%
  3976832 requests in 30.10s, 379.26MB read
Requests/sec: 132124.20
Transfer/sec:     12.60MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.03ms    2.78ms 208.05ms   90.77%
    Req/Sec     8.60k   749.64    13.75k    73.19%
  4118101 requests in 30.10s, 392.73MB read
Requests/sec: 136819.26
Transfer/sec:     13.05MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.83ms    3.33ms  47.72ms   88.67%
    Req/Sec     9.49k     1.10k   40.84k    87.81%
  4540119 requests in 30.10s, 432.98MB read
Requests/sec: 150848.85
Transfer/sec:     14.39MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.51ms    4.04ms 223.29ms   67.61%
    Req/Sec     9.88k     1.50k   37.86k    91.72%
  4726224 requests in 30.10s, 450.73MB read
Requests/sec: 157019.56
Transfer/sec:     14.97MB

### resteasy-netty4
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/rest/hello
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.02ms    3.21ms  80.07ms   91.22%
    Req/Sec     2.45k   253.41     7.26k    78.40%
  1169843 requests in 30.10s, 131.65MB read
Requests/sec:  38868.78
Transfer/sec:      4.37MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.11ms    3.62ms  63.82ms   72.81%
    Req/Sec     2.54k   231.56     8.90k    81.83%
  1214528 requests in 30.10s, 136.68MB read
Requests/sec:  40350.45
Transfer/sec:      4.54MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    11.83ms    6.04ms 272.64ms   77.88%
    Req/Sec     2.61k   532.48    10.15k    93.05%
  1237327 requests in 30.10s, 139.24MB read
Requests/sec:  41110.09
Transfer/sec:      4.63MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    21.91ms    9.22ms 305.95ms   80.44%
    Req/Sec     2.59k     0.90k   13.48k    85.05%
  1223592 requests in 30.09s, 137.70MB read
Requests/sec:  40663.64
Transfer/sec:      4.58MB

### Vert.x 3.1.0
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/rest/hello
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.79ms  785.66us  46.37ms   98.62%
    Req/Sec     3.41k   374.64     5.24k    77.94%
  1630874 requests in 30.03s, 127.54MB read
Requests/sec:  54307.21
Transfer/sec:      4.25MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.65ms  446.79us  17.53ms   73.62%
    Req/Sec     3.30k   352.51     4.23k    67.77%
  1580165 requests in 30.04s, 123.57MB read
Requests/sec:  52610.13
Transfer/sec:      4.11MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    11.73ms    1.18ms 222.79ms   90.78%
    Req/Sec     2.64k   266.62    11.68k    94.21%
  1261193 requests in 30.05s, 98.63MB read
Requests/sec:  41970.09
Transfer/sec:      3.28MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    24.80ms    2.76ms 253.31ms   88.73%
    Req/Sec     2.49k   214.98     3.70k    78.92%
  1192251 requests in 30.03s, 93.24MB read
Requests/sec:  39695.74
Transfer/sec:      3.10MB

### Go
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/rest/hello
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.12ms    7.10ms 131.22ms   90.98%
    Req/Sec     7.25k     1.67k   15.54k    70.00%
  3465942 requests in 30.04s, 423.09MB read
Requests/sec: 115388.10
Transfer/sec:     14.09MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.51ms    9.40ms 199.98ms   91.84%
    Req/Sec     6.75k     1.28k   13.88k    69.83%
  3225967 requests in 30.04s, 393.79MB read
Requests/sec: 107394.44
Transfer/sec:     13.11MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    13.11ms   23.94ms 394.80ms   89.51%
    Req/Sec     7.08k     2.12k   64.25k    73.32%
  3378959 requests in 30.09s, 412.47MB read
Requests/sec: 112292.01
Transfer/sec:     13.71MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    33.20ms   62.20ms 908.16ms   89.62%
    Req/Sec     7.17k     2.88k   16.91k    68.73%
  3417812 requests in 30.04s, 417.21MB read
Requests/sec: 113775.80
Transfer/sec:     13.89MB

### go-restful (iris)
[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c100 -d30s http://127.0.0.1:8080/rest/hello
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 100 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.84ms    5.40ms  80.97ms   90.77%
    Req/Sec     6.03k     1.65k   19.35k    75.03%
  2885226 requests in 30.09s, 319.18MB read
Requests/sec:  95899.44
Transfer/sec:     10.61MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c200 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.90ms    7.72ms 104.81ms   87.61%
    Req/Sec     6.61k     1.01k   15.55k    70.15%
  3162116 requests in 30.07s, 349.81MB read
Requests/sec: 105175.35
Transfer/sec:     11.64MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello 
[root@ip-172-31-4-198 ~]# wrk -t16 -c500 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    14.58ms   23.04ms 278.81ms   86.94%
    Req/Sec     6.90k     1.02k   12.04k    69.27%
  3297379 requests in 30.03s, 364.78MB read
Requests/sec: 109786.38
Transfer/sec:     12.15MB

[smallnest@ip-xxx-xxx-xxx-xxx ~]# wrk -t16 -c1000 -d30s http://127.0.0.1:8080/rest/hello 
Running 30s test @ http://127.0.0.1:8080/rest/hello
  16 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    35.13ms   57.20ms 553.38ms   86.80%
    Req/Sec     6.91k     1.05k   18.11k    70.85%
  3309745 requests in 30.10s, 366.14MB read
Requests/sec: 109966.09
Transfer/sec:     12.17MB


