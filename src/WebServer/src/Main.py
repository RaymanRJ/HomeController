from flask import Flask

app = Flask(__name__)


@app.route('/')
def hello_world():
    return 'Hello, World!'


if __name__ == '__main__':
    app.run(debug=True, use_debugger=False, use_reloader=True, passthrough_errors=True, host='0.0.0.0')