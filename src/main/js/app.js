'use strict';

const React = require('react');
const ReactDOM = require('react-dom')
const root = '/api';

class App extends React.Component {
	render() {
		return (
			<div>
			OII
			</div>
		)
	}
}


ReactDOM.render(
	<App />,
	document.getElementById('react')
)
