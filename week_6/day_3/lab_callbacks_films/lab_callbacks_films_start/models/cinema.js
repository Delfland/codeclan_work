const Cinema = function (films) {
  this.films = films;
};

module.exports = Cinema;

Cinema.prototype.getFilmTitles = function () {
  return this.films.map((film) => film.title);
};

Cinema.prototype.getFilmByTitle = function (filmTitle) {
  const filmByTitle = this.films.filter((film) => {
    return film.title === filmTitle;
  });
  return filmByTitle
}

Cinema.prototype.getFilmsByGenre = function (filmGenre) {
  const filmsByGenre = this.films.filter((film) => {
    return film.genre === filmGenre;
  });
  return filmsByGenre
}