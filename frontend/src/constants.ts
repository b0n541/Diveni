class Constants {
  backendURL = '127.0.0.1:9090';

  backendSessionRoute = '/createSession';

  // eslint-disable-next-line class-methods-use-this
  public getRandomPastelColor() {
    return `hsl(${360 * Math.random()},${
      25 + 70 * Math.random()}%,${
      85 + 10 * Math.random()}%)`;
  }
}

export default new Constants();
