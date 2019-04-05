# XY Inc

Plataforma fornecedora de serviços para um dispositivo receptor de GPS que auxilia pessoas na localização de pontos de interesse (POIs).

### Pré-requisitos

Para a execução do projeto é necessária a instalação da seguinte ferramenta:

- [Docker Compose](https://www.docker.com/)

### Instalação
 Para a execução do projeto é necessário rodar na raiz do projeto o seguinte comando: 

```bash
docker-compose up
```

### Acesso

URL de Acesso: \
http://localhost

Para [Docker Toolbox](https://docs.docker.com/toolbox/toolbox_install_windows/), 
acessar através do ip informado pelo comando:

```bash
docker-machine ip default
```

### API

*O serviço é baseado em Web-Services e utiliza JSON para a troca de informações

#### Cadastrar Pontos de Interesse | POST

> {host}/poi (POST)

Request:
```
{
	"name": "Lanchonete",
	"coordinateX": 27,
	"coordinateY": 12
}
```
Response:
```
{
    "id": 2,
    "name": "Lanchonete",
    "coordinateX": 27,
    "coordinateY": 12
}
```

#### Buscar pontos próximos | GET

> {host}/poi/next/cordenada-x/cordenada-y/distancia-maxima \
Ex: {host}/poi/next/20/10/10 (GET)

Response: 
```
[
    {
        "id": 2,
        "name": "Lanchonete",
        "coordinateX": 27,
        "coordinateY": 12
    }
]
```

#### Buscar todos os pontos cadastrados | GET

> {host}/poi (GET)

Response:

```
[
    {
        "id": 2,
        "name": "Lanchonete",
        "coordinateX": 27,
        "coordinateY": 12
    }
]
```
