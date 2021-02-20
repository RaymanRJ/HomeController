from flask import Flask


app = Flask(__name__)


@app.route('/')
def hello_world():
    return {
        "response": 'Hello, World!'
    }


@app.route('/health')
def health():
    return {
        "status": "healthy"
    }


if __name__ == '__main__':
    app.run(debug=True, use_debugger=False, use_reloader=True, passthrough_errors=True, host='0.0.0.0')
