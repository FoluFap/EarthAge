const inputWithSortedLetters = (word: string): string =>
  word.toLowerCase().split("").sort().toString();
export class Anagram {
  private inputString: string;
  constructor(inputString: string) {
    this.inputString = inputString;
  }
  matches(...words: string[]): string[] {
    return words.filter(
      (word) =>
        inputWithSortedLetters(word) ===
          inputWithSortedLetters(this.inputString) &&
        word.toLowerCase() !== this.inputString.toLowerCase()
    );
  }
}