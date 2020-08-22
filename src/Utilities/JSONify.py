import json


def toJSON(obj: object):
    return json.dumps(obj.__dict__)
