from flask import Flask

from src.SmartDevices.IRaspberryPi import IRaspberryPi
from src.Utilities.JSONify import toJSON

app = Flask(__name__)


@app.route('/')
def hello_world():
    device = IRaspberryPi(ip_address='192.168.0.1', port=22)
    return {
        "response": 'Hello, World!',
        "device": toJSON(device)
    }


if __name__ == '__main__':
    app.run(debug=True, use_debugger=False, use_reloader=True, passthrough_errors=True, host='0.0.0.0')
