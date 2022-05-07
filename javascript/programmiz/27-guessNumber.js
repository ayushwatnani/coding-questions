const guessNum = () => {
  let random = Math.floor(Math.random() * 10) + 1;

  let num = parseInt(prompt("enter a number "));

  if (num === random) {
    console.log("you guessed it...");
  }

  while (num !== random) {
    num = parseInt(prompt("enter a number "));
  }
};

guessNum();
