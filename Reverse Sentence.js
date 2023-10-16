function reverseWords(sentence) {
  const words = sentence.split(' ');

  const reversedWords = [];
  for (let i = 0; i < words.length; i++) {
    const word = words[i];
    const reversedWord = word.split('').reverse().join('');
    reversedWords.push(reversedWord);
  }

  const reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log("Reversed Sentence:", reversedSentence);
