function createPhoneNumber(numbers) {
    const number1 = numbers.slice(0,3).join('')
    const number2 = numbers.slice(3,6).join('')
    const number3 = numbers.slice(6,10).join('')

    return `(${number1}) ${number2}-${number3}`
}

module.exports = createPhoneNumber;