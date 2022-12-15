document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');


  const handleFormSubmit = function(event){
    event.preventDefault();
    const resultTitle = document.querySelector('#title');
    resultTitle.textContent = `${event.target.title.value}`
    const resultAuthor = document.querySelector('#author');
    resultAuthor.textContent = `${event.target.author.value}`
   }
  
  const form = document.querySelector('#new-item-form')
  form.addEventListener('submit', handleFormSubmit);
 

  const titleListItem = document.createElement('li')
  titleListItem.textContent = resultTitle.textContent;
  titleListItem.classList.add('title');
  const list = document.querySelector('ul');
  list.appendChild(newListItem) 
})
