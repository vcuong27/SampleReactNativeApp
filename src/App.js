/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React, { Component } from 'react';
import type { Node } from 'react';
import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  useColorScheme,
  View,
  TouchableOpacity,
} from 'react-native';

import {
  Colors,
  DebugInstructions,
  Header,
  LearnMoreLinks,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

const Section = ({ children, title }): Node => {
  const isDarkMode = useColorScheme() === 'dark';
  return (
    <View style={styles.sectionContainer}>
      <Text
        style={[
          styles.sectionTitle,
          {
            color: isDarkMode ? Colors.white : Colors.black,
          },
        ]}>
        {title}
      </Text>
      <Text
        style={[
          styles.sectionDescription,
          {
            color: isDarkMode ? Colors.light : Colors.dark,
          },
        ]}>
        {children}
      </Text>
    </View>
  );
};

class App extends Component {
  constructor(props) {
    console.log("App", "constructor");
    super(props);

    this.state = {
      result: 0
    }

  }
  
  _inCrease(){
    console.log("App", "_inCrease");
    this.setState({
      result : this.state.result + 1
    })
  }

  render() {
    console.log("App", "render");

    return (
      <View styles={{ flex: 1, backgroundColor: 'white' }}>
        <View styles={{ flex: 1, backgroundColor: 'blue', justifyContent: 'center', alignItems: 'center' }}>
          <Text> {this.state.result} </Text>
        </View>

        <View styles={{ flex: 1, backgroundColor: 'skyblue', justifyContent: 'center', alignItems: 'center' }}>
          <TouchableOpacity onPress={this._inCrease.bind(this)}>
            <Text> Click me </Text>
          </TouchableOpacity>

        </View>
      </View>
    );
  };



  componentDidCatch() {
    console.log("App", "componentDidCatch");
  }

  componentDidUpdate() {
    console.log("App", "componentDidUpdate");
  }

  componentWillUnmount() {
    console.log("App", "componentWillUnmount");
  }

  componentDidMount() {
    console.log("App", "componentDidMount");
  }

}




export default App;
