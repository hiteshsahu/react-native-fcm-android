import App from './src/app';
import React, { Component } from 'react';
import {
  AppRegistry,
} from 'react-native';

export default class ReactNotification extends Component {
  render() {
    return (
      <App/>
    );
  }
}

AppRegistry.registerComponent('ReactNotification', () => ReactNotification);
