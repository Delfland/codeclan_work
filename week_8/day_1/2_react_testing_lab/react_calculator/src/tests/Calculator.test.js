import React from 'react';
import Calculator from '../containers/Calculator';
import {render, fireEvent} from '@testing-library/react';

describe('Calculator', () => {
  let container;
  beforeEach(() => {
    container = render(<Calculator/>)
  })

  it('should change running total on number enter', () => {
    const button4 = container.getByTestId('number4');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button4);
    expect(runningTotal.textContent).toEqual('4');
  })

  it('should be able to add 1 to 4 and return 5', () => {
    const button4 = container.getByTestId('number4');
    const button1 = container.getByTestId('number1');
    const addButton = container.getByTestId('operator-add');
    const equalButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button4);
    fireEvent.click(addButton);
    fireEvent.click(button1);
    fireEvent.click(equalButton);
    expect(runningTotal.textContent).toEqual('5');
  })

  it('should be able to substract 4 from 7 and return 3', () => {
    const button4 = container.getByTestId('number4');
    const button7 = container.getByTestId('number7');
    const subtractButton = container.getByTestId('operator-subtract');
    const equalButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button7);
    fireEvent.click(subtractButton);
    fireEvent.click(button4);
    fireEvent.click(equalButton);
    expect(runningTotal.textContent).toEqual('3');
  })

  it('should be able to multiply 3 by 5 and return 15', () => {
    const button3 = container.getByTestId('number3');
    const button5 = container.getByTestId('number5');
    const multiplyButton = container.getByTestId('operator-multiply');
    const equalButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button3);
    fireEvent.click(multiplyButton);
    fireEvent.click(button5);
    fireEvent.click(equalButton);
    expect(runningTotal.textContent).toEqual('15');
  })

  it('should be able to divide 21 by 3 and return 7', () => {
    const button2 = container.getByTestId('number2');
    const button1 = container.getByTestId('number1');
    const button3 = container.getByTestId('number3');
    const divideButton = container.getByTestId('operator-divide');
    const equalButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button2);
    fireEvent.click(button1);
    fireEvent.click(divideButton);
    fireEvent.click(button3);
    fireEvent.click(equalButton);
    expect(runningTotal.textContent).toEqual('7');
  })

  it('should be able to press button 3 three times and return 333', () => {
    const button3 = container.getByTestId('number3');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button3);
    fireEvent.click(button3);
    fireEvent.click(button3);
    expect(runningTotal.textContent).toEqual('333');
  })

  it('should be able to calculate that 4 + 6 x 2 returns 20', () => {
    const button4 = container.getByTestId('number4');
    const button6 = container.getByTestId('number6');
    const button2 = container.getByTestId('number2');
    const addButton = container.getByTestId('operator-add');
    const multiplyButton = container.getByTestId('operator-multiply');
    const equalButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button4);
    fireEvent.click(addButton);
    fireEvent.click(button6);
    fireEvent.click(multiplyButton);
    fireEvent.click(button2);
    fireEvent.click(equalButton);
    expect(runningTotal.textContent).toEqual('20');
  })

  it('should be able to clear the running total without affecting the calculation', () => {
    const button2 = container.getByTestId('number2');
    const button6 = container.getByTestId('number6');
    const addButton = container.getByTestId('operator-add');
    const clearButton = container.getByTestId('clear');
    const equalButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button2);
    fireEvent.click(addButton);
    fireEvent.click(button2);
    fireEvent.click(equalButton);
    fireEvent.click(addButton);
    fireEvent.click(button6);
    fireEvent.click(clearButton);
    fireEvent.click(addButton);
    fireEvent.click(button2);
    fireEvent.click(equalButton);
    expect(runningTotal.textContent).toEqual('6');
  })
})

