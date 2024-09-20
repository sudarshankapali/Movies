# Movies API

1. Lists all movies

* URL: `/api/v1/movies`

* METHOD: `GET`

* Response:
1. Successful Response
```json
 [
    {
        "id": {
            "timestamp": 1720758921,
            "date": "2024-07-12T04:35:21.000+00:00"
        },
        "imdbId": "tt3447590",
        "title": "Roald Dahl's Matilda the Musical",
        "releaseDate": "2022-11-25",
        "trailerLink": "https://www.youtube.com/watch?v=lroAhsDr2vI",
        "poster": "https://image.tmdb.org/t/p/w500/ga8R3OiOMMgSvZ4cOj8x7prUNYZ.jpg",
        "genres": [
            "Fantasy",
            "Family",
            "Comedy"
        ],
        "backdrpos": null,
        "reviewIds": []
    },
    {
        "id": {
            "timestamp": 1720758921,
            "date": "2024-07-12T04:35:21.000+00:00"
        },
        "imdbId": "tt11116912",
        "title": "Troll",
        "releaseDate": "2022-12-01",
        "trailerLink": "https://www.youtube.com/watch?v=AiohkY_XQYQ",
        "poster": "https://image.tmdb.org/t/p/w500/9z4jRr43JdtU66P0iy8h18OyLql.jpg",
        "genres": [
            "Fantasy",
            "Action",
            "Adventure"
        ],
        "backdrpos": null,
        "reviewIds": []
    }
]
 ```

2. Add review

* URL: `/api/v1/reviews`

* METHOD: `POST`

* Request:
  ```json
  {
    "reviewBody" : "I really liked the movie",
    "imdbId": "tt3915174"
  }
  ```
* Response:
  ```json
  {
    "id": {
        "timestamp": 1726820429,
        "date": "2024-09-20T08:20:29.000+00:00"
    },
    "body": "I really liked the movie"
  }
  ```
