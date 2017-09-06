import React, { Component } from 'react';
import ReactFCM from './module/ReactFCM';
import { Platform } from 'react-native';
import Style from './Style';
import {
  AppRegistry,
  StyleSheet,
  Text,Switch,Image,
  View
} from 'react-native';

export default class App extends Component {

  state = {
 switchValue: false
          }

  toggleSwitch = (value) => {
      this.setState({ switchValue: value })
      ReactFCM.toggleNotification(value)
    }

    componentDidMount = () => {
         if(Platform.OS === 'android')
         {
           ReactFCM.isNotificationEnabled((shouldShowNotification) => {
                this.setState({ switchValue : shouldShowNotification })
              })
           }
   }

  render() {

    return (
      <View style={styles.container}>

        <Text style={styles.welcome}>
        React Native Firebase Push Notification
        </Text>

        <View >

              {(Platform.OS === 'android') && <Text>
                Toggle Push Notification!
               </Text>
               }

               {(Platform.OS === 'android') && <Switch onValueChange = {this.toggleSwitch}
                 value = {this.state.switchValue}
                 />
                }
               {(Platform.OS === 'android') && <Text>{this.state.switchValue ? 'Enabled' : 'Disabled'}
                </Text>
                }

                </View>

        </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

AppRegistry.registerComponent('App', () => App);
