FROM ubuntu:16.04

RUN apt-get update -y && \
    apt-get install -y python-pip python-dev curl

# We copy just the requirements.txt first to leverage Docker cache
COPY ./requirements.txt /src/requirements.txt

WORKDIR /src

RUN pip install -r requirements.txt

COPY . /src

ENTRYPOINT [ "python" ]

EXPOSE 8080

CMD [ "./src/Main.py" ]