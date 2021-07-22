# **SQL 3 - MOVIES DB**!

#### 2.  Adicione um filme à tabela de filmes.
     INSERT INTO movies_db.movies 
     (created_at, updated_at, title,rating, awards, release_date, length, genre_id)
      VALUES(now(), now(), 'Os Trombadinhas 1979', 10.0, 13, Date('1979-05-10'), 92, 8);
****
#### # 3.  Adicione um gênero à tabela de gêneros.
     
     INSERT INTO movies_db.genres
     (created_at, updated_at, name, ranking, active)
     VALUES(now(), now(), Biografia, 13, 1);
****
#### # 4.  Associe o filme do Ex 2. ao gênero criado no Ex. 3.

    UPDATE movies SET genre_id = 13 WHERE id = 22;
****

#### # 5.  Modifique a tabela de atores para que pelo menos um ator adicione como favorito o filme adicionado no Ex. 2.

    UPDATE actors SET favorite_movie_id = 23 WHERE id = 4;

****

#### 6.  Crie uma cópia temporária da tabela de filmes.

    CREATE TEMPORARY TABLE movies_temporary SELECT * FROM movies;

****

#### 7. Elimine desta tabela temporária todos os filmes que ganharam menos de 5 prêmios.

    DELETE FROM movies_temporary WHERE awards < 5;

****

#### 8.  Obtenha a lista de todos os gêneros que possuem pelo menos um filme.

    SELECT name, COUNT(g.id) as total 
    FROM genres as g 
    INNER JOIN movies as m on (g.id =  m.genre_id) 
    group by name having total > 1;
****

#### 9. Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios.

    SELECT a.first_name, a.last_name, m.title, m.awards FROM actors as a 
    INNER JOIN movies as m on (a.favorite_movie_id = m.id)
    having m.awards >= 3 
****

#### 10. Use o plano de explicação para analisar as consultas nos Ex. 6 e 7..

    explain delete from movies_temporary where awards < 5;

    explain select * from movies;

****


#### 12. Crie um índice sobre o nome na tabela de filmes.

    CREATE INDEX index_movies_title ON movies (title);
****

#### 13. Verifique se o índice foi criado corretamente.alter.

    SHOW INDEX FROM movies;

****


















