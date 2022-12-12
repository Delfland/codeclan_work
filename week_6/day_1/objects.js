var movie = {
    title: "It's a wonderful life",
    year: 1946,
    language: 'Spanish'
};
movie.cast = ['James Stewart', 'Donna Reed'];
movie['subtitle-language'] = 'French';
console.log('movie:', movie);

console.log(movie.title);

var keyName = 'cast';
console.log(movie[keyName]);

delete movie['subtitle-language'];
console.log(movie);

movie.ratings = {
    critic:94,
    audience: 95
};
console.log(movie);
console.log(movie.ratings.critic);

for (var key in movie) {
    console.log('keywas:' , key, ' value was: ', movie[key]);
    console.log(`key was: ${key} value was: ${movie[key]}`)
}

// to get a list of keys in an object
var movieKeys = Object.keys(movie);
console.log(movieKeys);
