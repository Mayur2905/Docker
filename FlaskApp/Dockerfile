FROM python

LABEL Folder="FlaskApp"
LABEL Author="Mayur"

COPY  . .

RUN pip install -r requirements.txt

EXPOSE 5000

CMD ["python" ,"app.py"]