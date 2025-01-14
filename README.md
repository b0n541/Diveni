# Diveni - The Planning-Poker App

![GitHub Repo stars](https://img.shields.io/github/stars/Sybit-Education/Diveni?style=social)

[![License](https://img.shields.io/badge/license-GNU%20AGPL%20v3-blue.svg)](LICENSE)
[![Crowdin](https://badges.crowdin.net/diveni/localized.svg)](https://crowdin.com/project/diveni)
[![Discord](https://img.shields.io/discord/935641426216222730?color=%237289DA&label=Discord&logo=Discord&logoColor=%237289DA)](https://discord.com/channels/935641426216222730/)

![Code Coverage Lnies](.github/badges/jacoco.svg)
![Code Coverage Branches](.github/badges/branches.svg)

---

## Hacktoberfest 2022

Diveni participates on Hacktoberfest 2022! We are looking forward to your support to improve this awesome app!

Have a look on the [issues tagged `hacktoberfest`](https://github.com/Sybit-Education/Diveni/issues?q=is%3Aissue+is%3Aopen+label%3Ahacktoberfest) 
and connect to our Discord: ![Discord](https://img.shields.io/discord/935641426216222730?color=%237289DA&label=Discord&logo=Discord&logoColor=%237289DA)

---

![DIVENI Logo](docs/assets/diveni_banner.png)

WebApp to do Planning Poker with remote teams using external issue tracker as source of stories.

Supported issue trackers:

- Atlassian JIRA on premise
- Atlassian JIRA Cloud
- More connectors are planned

## Read more

see: [Diveni Website](https://sybit-education.github.io/Diveni/)

<a href="https://www.producthunt.com/posts/diveni?utm_source=badge-featured&utm_medium=badge&utm_souce=badge-diveni" target="_blank"><img src="https://api.producthunt.com/widgets/embed-image/v1/featured.svg?post_id=361171&theme=light" alt="Diveni - The&#0032;Planning&#0045;Poker&#0032;App | Product Hunt" style="width: 250px; height: 54px;" width="250" height="54" /></a>

---

## Some Screenshots

![Voters view of voted story](docs/.vuepress/public/img/userEstimationVoted.JPG)

![Host view voted story](docs/.vuepress/public/img/hostEstimationFinished.JPG)


## Application Instructions and Requirements

### Technologies

Frontend communicates via REST and WebSockets with the backend.
The backend uses Spring boot and communicates with the mongoDb in a docker infrastructure.

### Run Diveni with Docker and Docker Compose
#### Run with pre-built docker images using [docker-compose](https://github.com/Sybit-Education/Diveni/blob/main/docker-compose.yml)
```shell
docker-compose up -d
```
#### Run with self-build docker images using [docker-compose.dev](https://github.com/Sybit-Education/Diveni/blob/main/docker-compose.dev.yml)
```shell
docker-compose -f docker-compose.dev.yml up --build -d
```

### Run Diveni locally

#### Frontend
- npm, vue2

```shell
npm install
npm run serve
```
 
#### Backend

- maven, springboot, java11

```shell
mvn spring-boot:run
```

#### Database

- Mongodb in docker on port 27017, no credentials (Run via docker desktop)

---

## Contributors

[![Diveni Contributors](https://contrib.rocks/image?repo=Sybit-Education/Diveni)](https://github.com/Sybit-Education/Diveni/graphs/contributors)

Made with [contrib.rocks](https://contrib.rocks).

## Credits

- Icons: [Animal by Thiago Silva](https://www.iconfinder.com/iconsets/animals-105), License: [CC0 1.0 Universal](https://creativecommons.org/publicdomain/zero/1.0/)

---

## License

[LICENSE](LICENSE)
