/**
 * Style.js
 *
 * Created by kylewbanks on 2016-08-07.
 */
'use strict';

import { StyleSheet ,Dimensions} from 'react-native';
const { width, height } = Dimensions.get('window');

var Style = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',

  },

  welcome: {
    textAlign: 'center',
    color: '#FFF',
    fontWeight: 'bold',
    fontFamily: 'Roboto-Bold',
    fontSize: 25,
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#FFF',
    marginBottom: 5,
  },

// Background image
imageBackground: {
 flex: 1,
 width:width,
 height:height,                      // Take up all screen space
 padding: 20                         // Add padding for content inside
},
});

export default Style;
