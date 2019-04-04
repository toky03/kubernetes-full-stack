FROM python:3.6-alpine

COPY requirements.txt /app/requirements.txt

COPY rand_gen.py /app/rand_gen.py

WORKDIR /app

RUN pip install -r requirements.txt

ENTRYPOINT ["python"]

CMD ["rand_gen.py"]
