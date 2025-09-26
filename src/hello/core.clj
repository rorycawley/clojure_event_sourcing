(ns hello.core
    (:gen-class))

(defn greet
      "Returns a greeting string for the given name."
      [name]
      (str "Hello, " name "!"))

(defn -main
      "This is the entry point for the application."
      [& args]
      (println (greet "World")))