FROM python:3.10

LABEL Folder="FlaskApp"
LABEL Author="Mayur"

RUN pip install -r requirements.txt
EXPOSE 5000

# running the flask app

CMD ["flask" ,"run" ,"--host","0.0.0.0"]
