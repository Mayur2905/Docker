FROM python:3.9

LABEL Folder="FlaskApp"
LABEL Author="Mayur"

WORKDIR /FlaskApp

RUN pip install -r requirements.txt

EXPOSE 5000

# running the flask app

CMD ["python", "app.py"]
