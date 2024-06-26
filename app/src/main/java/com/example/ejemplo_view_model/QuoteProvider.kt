package com.example.ejemplo_view_model

class QuoteProvider {
    companion object {
        fun random(): QuoteModel{
            val position = (0..3).random()
            return quote[position]
        }
      private  val quote = listOf<QuoteModel>(
          QuoteModel(
              quote = "La educación es el arma más poderosa que puedes usar para cambiar el mundo.",
              author = "Nelson Mandela"
          ),
          QuoteModel(
              quote = "No importa lo lento que vayas mientras no te detengas.",
              author = "Confucio"
          ),
          QuoteModel(
              quote = "La vida es lo que pasa mientras estás ocupado haciendo otros planes.",
              author = "John Lennon"
          ),
          QuoteModel(
              quote = "No busques errores, busca soluciones.",
              author = "Henry Ford"
          ),
          QuoteModel(
              quote = "El éxito no es definitivo, el fracaso no es fatal: lo que cuenta es el coraje para continuar.",
              author = "Winston Churchill"
          ),
          QuoteModel(
              quote = "El mayor riesgo es no correr ningún riesgo. En un mundo que cambia rápidamente, la única estrategia que garantiza fallar es no correr riesgos.",
              author = "Mark Zuckerberg"
          ),
          QuoteModel(
              quote = "El futuro pertenece a quienes creen en la belleza de sus sueños.",
              author = "Eleanor Roosevelt"
          ),
          QuoteModel(
              quote = "No dejes que la educación interfiera con tu aprendizaje.",
              author = "Mark Twain"
          ),
          QuoteModel(
              quote = "La vida es 10% lo que me sucede y 90% cómo reacciono a ello.",
              author = "Charles R. Swindoll"
          ),
          QuoteModel(
              quote = "El éxito es la suma de pequeños esfuerzos repetidos día tras día.",
              author = "Robert Collier"
          ),
          QuoteModel(
              quote = "La imaginación es más importante que el conocimiento. El conocimiento es limitado, mientras que la imaginación no tiene límites.",
              author = "Albert Einstein"
          )
      )


    }
}