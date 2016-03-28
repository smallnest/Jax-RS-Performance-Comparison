package main

import "github.com/kataras/iris"

func main() {
	r := iris.New()
	r.Get("/rest/hello", hello)
	r.Listen(":8080")
}

func hello(c *iris.Context) {
	c.WriteText(200, "Hello world")
}
