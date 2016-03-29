package main

import (
	"github.com/kataras/iris"
)

func main() {
	api := iris.New()
	api.Get("/rest/hello", func(c *iris.Context) {
		c.Text("Hello world")
	})
	api.Listen(":8080")
}
