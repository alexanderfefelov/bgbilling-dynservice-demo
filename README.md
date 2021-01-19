# bgbilling-dynservice-demo

## Что это?

bgbilling-dynservice-demo - это демонстрационная реализация dynservice для использования совместно с сервером [BGBilling](https://bgbilling.ru/).

## Как это установить?

Склонируйте этот репозиторий:

```
git clone https://github.com/alexanderfefelov/bgbilling-dynservice-demo
```

Скопируйте содержимое каталога `dyn` в каталог `dyn` вашего экземпляра BGBilling.

## Привет, мир!

- [HelloWorld.java](dyn/com/github/alexanderfefelov/bgbilling/dynservice/demo/HelloWorld.java)
- [HelloWorldImpl.java](dyn/com/github/alexanderfefelov/bgbilling/dynservice/demo/HelloWorldImpl.java)

В конфигурацию ядра добавьте:

```properties
# Dynservice: Привет, мир!
#
#         Модуль  Сервис                             Класс сервиса
#           │       │                                      │
#          ┌┴─┐ ┌───┴────┐ ┌───────────────────────────────┴──────────────────────────────────┐
#          │  │ │        │ │                                                                  │
dynservice:demo.HelloWorld=com.github.alexanderfefelov.bgbilling.dynservice.demo.HelloWorldImpl
```

Теперь выполните:

```
http --verbose --check-status \
  POST http://bgbilling-server.backpack.test:63081/billing/executer/json/demo/HelloWorld \
      method=helloWorld \
      params:='{}' \
      user:='{"user": "admin", "pswd": "admin"}'
```

В результате на запрос:

```
POST /billing/executer/json/demo/HelloWorld HTTP/1.1
Accept: application/json, */*
Accept-Encoding: gzip, deflate
Connection: keep-alive
Content-Length: 82
Content-Type: application/json
Host: bgbilling-server.backpack.test:63081
User-Agent: HTTPie/1.0.3

{
    "method": "helloWorld",
    "params": {},
    "user": {
        "pswd": "admin",
        "user": "admin"
    }
}
```

будет получен ответ:

```
HTTP/1.1 200 OK
Content-Length: 90
Date: Tue, 19 Jan 2021 04:30:49 GMT

{"status":"ok","exception":null,"message":"","tag":null,"data":{"return":"Hello, World!"}}
```
