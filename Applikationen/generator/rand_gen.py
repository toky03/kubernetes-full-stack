from flask import Flask, jsonify
import random
import uuid

app = Flask(__name__)
user_id = uuid.uuid4().int

@app.route('/')
def random_number():
    object = {'id' : str(user_id),
            'randNumber': str(random.randint(0,1000))}
    return jsonify(object)

if __name__ == '__main__':
    app.run(port=5050,host='0.0.0.0')
