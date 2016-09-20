package main

import (
	"log"

	"github.com/valyala/fasthttp"
)

func main() {
	err := fasthttp.ListenAndServe(":8080", fastHTTPHandler)
	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}
}

func fastHTTPHandler(ctx *fasthttp.RequestCtx) {
	if string(ctx.Method()) == "GET" {
		switch string(ctx.Path()) {
		case "/rest/hello":
			ctx.Write([]byte("Hello world"))
		default:
			ctx.Error("Unsupported path", fasthttp.StatusNotFound)
		}
		return
	}
}
