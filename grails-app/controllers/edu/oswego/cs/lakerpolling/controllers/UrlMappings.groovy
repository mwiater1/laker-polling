package edu.oswego.cs.lakerpolling.controllers

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "/"(controller: 'application', action:'application')
        "/login"(controller: 'application', action: 'login')
        "/results"(controller: 'application', action: 'results')
        "/results/**"(view: '/notFound')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
