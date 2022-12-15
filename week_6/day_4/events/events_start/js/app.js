document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');

// buttons
  const handleButtonClick = function(){
    const resultParagraph = document.querySelector('#button-result');
    resultParagraph.textContent = 'That button has definitely been clicked';
  }

  const button = document.querySelector('#button');
  button.addEventListener('click', handleButtonClick);

// inputs
  const handleInput = function(event){
    const resultParagraph = document.querySelector('#input-result')
    resultParagraph.textContent = `You typed: ${event.target.value}`;
  }

  const textInput = document.querySelector('#input')
  textInput.addEventListener('input', handleInput)

//selects
  const handleSelectChange = function(event) {
    const resultParagraph = document.querySelector('#select-result');
    resultParagraph.textContent = `You selected: ${event.target.value}`
  }

  const select = document.querySelector('#select');
  select.addEventListener('change', handleSelectChange);

//forms
 const handleFormSubmit = function(event){
  event.preventDefault();
  const resultParagraph = document.querySelector('#form-result');
  resultParagraph.textContent = `
  Your name:
  ${event.target.first_name.value}
  ${event.target.last_name.value}`
 }

  const form = document.querySelector('#form')
  form.addEventListener('submit', handleFormSubmit);

});

