package main

import (
	"log"
	"net/http"
)

// There are some golang RESTful libraries and mux libraries but i use the simplest to test.
func main() {
	http.HandleFunc("/rest/hello", func(w http.ResponseWriter, r *http.Request) {
		w.Write([]byte("Hello world"))
	})

	err := http.ListenAndServe(":8080", nil)
	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}
}
