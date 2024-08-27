from flask import Flask, jsonify
import requests as rp
import pandas as pd

app = Flask(__name__)

@app.route('/api/statistics/invoices', methods=['GET'])
def invoices():
    url='https://localhost:8080/api/statistics'
    headers= {'Content-Type': 'application/json',
              'Accept-Encoding': 'deflate'}
    response = rp.get(url, headers=headers)
    data = response.json()
    df = pd.json_normalize(data, 'data')
    # Cleaning data 
    df = df.replace(to_replace='None', value=None)
    df = df.dropna(subset=['total_amount'])
    df = df.astype({'total_amount': 'float'})
    total_amount_sum = df['total_amount'].sum()
    return jsonify({'total_amount_sum': total_amount_sum,
                   'invoices': df.to_dict(orient='records')})
    #return jsonify(df.to_dict(orient='list'))


if __name__ == '__main__':
    app.run(debug=True)